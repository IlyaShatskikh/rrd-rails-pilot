CREATE TABLE DISTANCE_PASSPORT(
    IDROW INTEGER               -- id записи
    , SITEID VARCHAR2(10)       -- id дороги
    , ASSETNUM VARCHAR2(100)    -- id главного пути
    , PUTGL_ID INTEGER          -- код пути ЦНСИ
    , CHANGEDATE DATE           -- дата корректировки
    , ID_CATEG INTEGER          -- id категории
    , ID_CLASS INTEGER          -- id класс
    , ID_GRUP INTEGER           -- id группы
    , M1 INTEGER                -- абсолбтный метр начала
    , M2 INTEGER                -- абсолютный метр конца
    , KMN INTEGER               -- километр начала
    , KMK INTEGER               -- километр конца
    , PKN INTEGER               -- пикет начала
    , PKK INTEGER               -- пикет конца
    , MN INTEGER                -- метр начала
    , MK INTEGER                -- метр конца
    , L INTEGER
    );

INSERT INTO DISTANCE_PASSPORT
 VALUES (1, 'id_dor1', 'id_main_path1', 1, DATE '2004-03-01', 1,1,1,1,1,1,1,1,1,1,1,1)
 ,(2, 'id_dor2', 'id_main_path2', 2, DATE '2004-03-02', 2,2,2,2,2,2,2,2,2,2,2,2)
 ,(3, 'id_dor3', 'id_main_path3', 3, DATE '2004-03-03', 3,3,3,3,3,3,3,3,3,3,3,3);
