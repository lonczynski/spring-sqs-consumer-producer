package br.com.lonczynski.transformer;

import com.google.gson.Gson;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class BaseTransformer {
    protected <T> List<T> parseHashMapList(List<HashMap> hashMapList, Class<T> classObject) {
        return hashMapList.stream()
                .map(m -> {
                    T parsedClass = null;
                    try {
                        parsedClass = classObject.getDeclaredConstructor().newInstance();
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }

                    for(Field field : parsedClass.getClass().getDeclaredFields()){
                        if(m.containsKey(field.getName())){
                            try {
                                field.setAccessible(true);

                                var value = m.get(field.getName());

                                if (value.getClass().equals(BigDecimal.class))
                                    value = ((BigDecimal) value).intValue();

                                field.set(parsedClass, value);
                            } catch (IllegalAccessException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    return parsedClass;
                })
                .filter(f -> f != null)
                .collect(Collectors.toList());
    }

    protected List<HashMap> reduceSize(List<HashMap> hashMapList) {
        return hashMapList.subList(0, (int) Math.round(hashMapList.size() * 0.9));
    }

    protected <T> boolean shouldReduceJsonSize(List<T> list) {
        String json = new Gson().toJson(list);

        int jsonBytes = json.getBytes().length;

        return jsonBytes > 255000;
    }
}
