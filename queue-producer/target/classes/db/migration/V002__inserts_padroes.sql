INSERT INTO MAIN.IDENTITY_SEXO (ID, NOME)
VALUES ('M', 'Masculino');

INSERT INTO MAIN.IDENTITY_SEXO (ID, NOME)
VALUES ('F', 'Feminino');

INSERT INTO MAIN.ESTOQUE_TIPO_ITEM (ID_SUBTENANT, NOME) VALUES (1007, 'Item de estoque');
INSERT INTO MAIN.ESTOQUE_TIPO_ITEM (ID_SUBTENANT, NOME) VALUES (1007, 'Item não padronizado');
INSERT INTO MAIN.ESTOQUE_TIPO_ITEM (ID_SUBTENANT, NOME) VALUES (1007, 'Nome comercial');

INSERT INTO MAIN.MONITORIZACAO_GRUPO_MEDIDA (ID, NOME) VALUES (1, 'Comprimento');
INSERT INTO MAIN.MONITORIZACAO_GRUPO_MEDIDA (ID, NOME) VALUES (2, 'Massa');
INSERT INTO MAIN.MONITORIZACAO_GRUPO_MEDIDA (ID, NOME) VALUES (3, 'Outros');
INSERT INTO MAIN.MONITORIZACAO_GRUPO_MEDIDA (ID, NOME) VALUES (4, 'Pressão');
INSERT INTO MAIN.MONITORIZACAO_GRUPO_MEDIDA (ID, NOME) VALUES (5, 'Temperatura');
INSERT INTO MAIN.MONITORIZACAO_GRUPO_MEDIDA (ID, NOME) VALUES (6, 'Volume');

INSERT INTO MAIN.MONITORIZACAO_UNIDADE_MEDIDA (ID, NOME) VALUES (1, 'cm');
INSERT INTO MAIN.MONITORIZACAO_UNIDADE_MEDIDA (ID, NOME) VALUES (2, 'm');
INSERT INTO MAIN.MONITORIZACAO_UNIDADE_MEDIDA (ID, NOME) VALUES (3, 'g');
INSERT INTO MAIN.MONITORIZACAO_UNIDADE_MEDIDA (ID, NOME) VALUES (4, 'kg');
INSERT INTO MAIN.MONITORIZACAO_UNIDADE_MEDIDA (ID, NOME) VALUES (5, 'mg');
INSERT INTO MAIN.MONITORIZACAO_UNIDADE_MEDIDA (ID, NOME) VALUES (6, '%');
INSERT INTO MAIN.MONITORIZACAO_UNIDADE_MEDIDA (ID, NOME) VALUES (7, '1000/mm3');
INSERT INTO MAIN.MONITORIZACAO_UNIDADE_MEDIDA (ID, NOME) VALUES (8, 'bpm');
INSERT INTO MAIN.MONITORIZACAO_UNIDADE_MEDIDA (ID, NOME) VALUES (9, 'mL/dia');
INSERT INTO MAIN.MONITORIZACAO_UNIDADE_MEDIDA (ID, NOME) VALUES (10, 'mg/dL');
INSERT INTO MAIN.MONITORIZACAO_UNIDADE_MEDIDA (ID, NOME) VALUES (11, 'mmol/L');
INSERT INTO MAIN.MONITORIZACAO_UNIDADE_MEDIDA (ID, NOME) VALUES (12, 'mrpm');
INSERT INTO MAIN.MONITORIZACAO_UNIDADE_MEDIDA (ID, NOME) VALUES (13, 'rpm');
INSERT INTO MAIN.MONITORIZACAO_UNIDADE_MEDIDA (ID, NOME) VALUES (14, 'ugrama/kg/minuto');
INSERT INTO MAIN.MONITORIZACAO_UNIDADE_MEDIDA (ID, NOME) VALUES (15, '°');
INSERT INTO MAIN.MONITORIZACAO_UNIDADE_MEDIDA (ID, NOME) VALUES (16, 'cmH2O');
INSERT INTO MAIN.MONITORIZACAO_UNIDADE_MEDIDA (ID, NOME) VALUES (17, 'cmHg');
INSERT INTO MAIN.MONITORIZACAO_UNIDADE_MEDIDA (ID, NOME) VALUES (18, 'mmHg');
INSERT INTO MAIN.MONITORIZACAO_UNIDADE_MEDIDA (ID, NOME) VALUES (19, '°c');
INSERT INTO MAIN.MONITORIZACAO_UNIDADE_MEDIDA (ID, NOME) VALUES (20, 'cm³');
INSERT INTO MAIN.MONITORIZACAO_UNIDADE_MEDIDA (ID, NOME) VALUES (21, 'l');
INSERT INTO MAIN.MONITORIZACAO_UNIDADE_MEDIDA (ID, NOME) VALUES (22, 'ml');

INSERT INTO MAIN.MONITORIZACAO_TIPO_LANCAMENTO (ID, NOME) VALUES (1, 'Normal');
INSERT INTO MAIN.MONITORIZACAO_TIPO_LANCAMENTO (ID, NOME) VALUES (2, 'Alterado');
INSERT INTO MAIN.MONITORIZACAO_TIPO_LANCAMENTO (ID, NOME) VALUES (3, 'Aberrante');

INSERT INTO MAIN.MONITORIZACAO_TIPO_NOTIFICACAO (ID, NOME) VALUES (0, 'Sem notificação');
INSERT INTO MAIN.MONITORIZACAO_TIPO_NOTIFICACAO (ID, NOME) VALUES (1, 'Apenas notificação');
INSERT INTO MAIN.MONITORIZACAO_TIPO_NOTIFICACAO (ID, NOME) VALUES (2, 'Notificação e bloqueio');

INSERT INTO MAIN.MONITORIZACAO_TIPO_DADO (ID, NOME) VALUES (1, 'Valor inteiro');
INSERT INTO MAIN.MONITORIZACAO_TIPO_DADO (ID, NOME) VALUES (2, 'Valor decimal');
INSERT INTO MAIN.MONITORIZACAO_TIPO_DADO (ID, NOME) VALUES (3, 'Alfanumérico');

INSERT INTO MAIN.MONITORIZACAO_SEXO (ID, NOME) VALUES ('M', 'Masculino');
INSERT INTO MAIN.MONITORIZACAO_SEXO (ID, NOME) VALUES ('F', 'Feminino');
INSERT INTO MAIN.MONITORIZACAO_SEXO (ID, NOME) VALUES ('A', 'Ambos');

--SELECT * FROM MAIN.PRESCRICAO_TIPO_LANCAMENTO;
INSERT INTO MAIN.PRESCRICAO_TIPO_LANCAMENTO (ID, NOME, SGH_ID_PRTPLAN)
VALUES (1, 'Jejum', 1);

INSERT INTO MAIN.PRESCRICAO_TIPO_LANCAMENTO (ID, NOME, SGH_ID_PRTPLAN)
VALUES (2, 'Dieta livre', 2);

INSERT INTO MAIN.PRESCRICAO_TIPO_LANCAMENTO (ID, NOME, SGH_ID_PRTPLAN)
VALUES (3, 'Dieta Oral', 3);

INSERT INTO MAIN.PRESCRICAO_TIPO_LANCAMENTO (ID, NOME, SGH_ID_PRTPLAN)
VALUES (4, 'Dieta Enteral', 4);

INSERT INTO MAIN.PRESCRICAO_TIPO_LANCAMENTO (ID, NOME, SGH_ID_PRTPLAN)
VALUES (5, 'Dieta Parenteral', 5);

INSERT INTO MAIN.PRESCRICAO_TIPO_LANCAMENTO (ID, NOME, SGH_ID_PRTPLAN)
VALUES (6, 'Medicamento', 6);

INSERT INTO MAIN.PRESCRICAO_TIPO_LANCAMENTO (ID, NOME, SGH_ID_PRTPLAN)
VALUES (7, 'Solução', 7);

INSERT INTO MAIN.PRESCRICAO_TIPO_LANCAMENTO (ID, NOME, SGH_ID_PRTPLAN)
VALUES (8, 'Hemoterapia', 8);

INSERT INTO MAIN.PRESCRICAO_TIPO_LANCAMENTO (ID, NOME, SGH_ID_PRTPLAN)
VALUES (9, 'Nível de atividades', 9);

INSERT INTO MAIN.PRESCRICAO_TIPO_LANCAMENTO (ID, NOME, SGH_ID_PRTPLAN)
VALUES (10, 'Oxigenoterapia - Respiração Espontânea', 10);

INSERT INTO MAIN.PRESCRICAO_TIPO_LANCAMENTO (ID, NOME, SGH_ID_PRTPLAN)
VALUES (11, 'Oxigenoterapia - Ventilação Mecânica Não Invasiva', 11);

INSERT INTO MAIN.PRESCRICAO_TIPO_LANCAMENTO (ID, NOME, SGH_ID_PRTPLAN)
VALUES (12, 'Oxigenoterapia - Ventilação Mecânica Invasiva', 12);

INSERT INTO MAIN.PRESCRICAO_TIPO_LANCAMENTO (ID, NOME, SGH_ID_PRTPLAN)
VALUES (13, 'Procedimentos clínicos', 13);

INSERT INTO MAIN.PRESCRICAO_TIPO_LANCAMENTO (ID, NOME, SGH_ID_PRTPLAN)
VALUES (14, 'Procedimentos de Enfermagem - Glicemia capilar', 14);

INSERT INTO MAIN.PRESCRICAO_TIPO_LANCAMENTO (ID, NOME, SGH_ID_PRTPLAN)
VALUES (15, 'Procedimentos de Enfermagem - Sinais Vitais', 15);

INSERT INTO MAIN.PRESCRICAO_TIPO_LANCAMENTO (ID, NOME, SGH_ID_PRTPLAN)
VALUES (16, 'Item avulto de Balanço Hídrico', 16);

INSERT INTO MAIN.PRESCRICAO_TIPO_LANCAMENTO (ID, NOME, SGH_ID_PRTPLAN)
VALUES (17, 'Item não padronizado', 17);

INSERT INTO MAIN.PRESCRICAO_TIPO_LANCAMENTO (ID, NOME, SGH_ID_PRTPLAN)
VALUES (18, 'Nome comercial', 18);

INSERT INTO MAIN.PRESCRICAO_FREQUENCIA (ID, NOME, SGH_ID_PRFREQUENCIA)
VALUES (1, 'ACM', 1);

INSERT INTO MAIN.PRESCRICAO_FREQUENCIA (ID, NOME, SGH_ID_PRFREQUENCIA)
VALUES (2, 'ACM Contínua', 2);

INSERT INTO MAIN.PRESCRICAO_FREQUENCIA (ID, NOME, SGH_ID_PRFREQUENCIA)
VALUES (3, 'Única', 3);

INSERT INTO MAIN.PRESCRICAO_FREQUENCIA (ID, NOME, SGH_ID_PRFREQUENCIA)
VALUES (4, 'Contínua', 4);

INSERT INTO MAIN.PRESCRICAO_FREQUENCIA (ID, NOME, SGH_ID_PRFREQUENCIA)
VALUES (5, '12/12', 5);

INSERT INTO MAIN.PRESCRICAO_FREQUENCIA (ID, NOME, SGH_ID_PRFREQUENCIA)
VALUES (6, '11/11', 6);

INSERT INTO MAIN.PRESCRICAO_FREQUENCIA (ID, NOME, SGH_ID_PRFREQUENCIA)
VALUES (7, '10/10', 7);

INSERT INTO MAIN.PRESCRICAO_FREQUENCIA (ID, NOME, SGH_ID_PRFREQUENCIA)
VALUES (8, '09/09', 8);

INSERT INTO MAIN.PRESCRICAO_FREQUENCIA (ID, NOME, SGH_ID_PRFREQUENCIA)
VALUES (9, '08/08', 9);

INSERT INTO MAIN.PRESCRICAO_FREQUENCIA (ID, NOME, SGH_ID_PRFREQUENCIA)
VALUES (10, '07/07', 10);

INSERT INTO MAIN.PRESCRICAO_FREQUENCIA (ID, NOME, SGH_ID_PRFREQUENCIA)
VALUES (11, '06/06', 11);

INSERT INTO MAIN.PRESCRICAO_FREQUENCIA (ID, NOME, SGH_ID_PRFREQUENCIA)
VALUES (12, '05/05', 12);

INSERT INTO MAIN.PRESCRICAO_FREQUENCIA (ID, NOME, SGH_ID_PRFREQUENCIA)
VALUES (13, '04/04', 13);

INSERT INTO MAIN.PRESCRICAO_FREQUENCIA (ID, NOME, SGH_ID_PRFREQUENCIA)
VALUES (14, '03/03', 14);

INSERT INTO MAIN.PRESCRICAO_FREQUENCIA (ID, NOME, SGH_ID_PRFREQUENCIA)
VALUES (15, '02/02', 15);

INSERT INTO MAIN.PRESCRICAO_FREQUENCIA (ID, NOME, SGH_ID_PRFREQUENCIA)
VALUES (16, '01/01', 16);

INSERT INTO MAIN.PRESCRICAO_FREQUENCIA (ID, NOME, SGH_ID_PRFREQUENCIA)
VALUES (17, 'Outras', 17);

INSERT INTO MAIN.PRESCRICAO_FREQUENCIA (ID, NOME, SGH_ID_PRFREQUENCIA)
VALUES (18, 'Relativa', 18);

-- SELECT * FROM MAIN.PRESCRICAO_SENECESSARIO;
INSERT INTO MAIN.PRESCRICAO_SENECESSARIO (ID, NOME, SGH_ID_PRSENECESSARIO)
VALUES (1, 'Em caso de febre', 1);

INSERT INTO MAIN.PRESCRICAO_SENECESSARIO (ID, NOME, SGH_ID_PRSENECESSARIO)
VALUES (2, 'Em caso de dor', 2);

INSERT INTO MAIN.PRESCRICAO_SENECESSARIO (ID, NOME, SGH_ID_PRSENECESSARIO)
VALUES (3, 'Em caso de vômito', 3);

INSERT INTO MAIN.PRESCRICAO_SENECESSARIO (ID, NOME, SGH_ID_PRSENECESSARIO)
VALUES (4, 'Outros', 4);

--SELECT * FROM MAIN.CHECAGEM_SITUACAO;
INSERT INTO MAIN.CHECAGEM_SITUACAO (ID, ID_SUBTENANT, NOME)
VALUES ('P', 1007, 'Prescrito');

INSERT INTO MAIN.CHECAGEM_SITUACAO (ID, ID_SUBTENANT, NOME)
VALUES ('A', 1007, 'Administrado');

INSERT INTO MAIN.CHECAGEM_SITUACAO (ID, ID_SUBTENANT, NOME)
VALUES ('N', 1007, 'Não administrado');

INSERT INTO MAIN.CHECAGEM_SITUACAO (ID, ID_SUBTENANT, NOME)
VALUES ('p', 1007, 'Parcialmente administrado');

INSERT INTO MAIN.CHECAGEM_SITUACAO (ID, ID_SUBTENANT, NOME)
VALUES ('S', 1007, 'Suspenso');