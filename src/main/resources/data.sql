INSERT INTO countries (id, name)
VALUES (1, 'Lithuania');

INSERT INTO countries (id, name)
VALUES (2, 'Germany');

INSERT INTO countries (id, name)
VALUES (3, 'France');

INSERT INTO countries (id, name)
VALUES (4, 'Luxumbourg');

INSERT INTO countries (id, name)
VALUES (5, 'Netherlands');



INSERT INTO cities (
    id,
    name,
    population,
    zip_code,
    description,
    country_id
)
VALUES (
           1,
           'Vilnius',
           580000,
           'LT-01100',
           'Capital of Lithuania',
           1
       );

INSERT INTO cities (
    id,
    name,
    population,
    zip_code,
    description,
    country_id
)
VALUES (
           2,
           'Kaunas',
           300000,
           'LT-44000',
           'Second largest city in Lithuania',
           1
       );

INSERT INTO cities (
    id,
    name,
    population,
    zip_code,
    description,
    country_id
)
VALUES (
           3,
           'Berlin',
           3600000,
           '10115',
           'Capital of Germany',
           2
       );

INSERT INTO cities (
    id,
    name,
    population,
    zip_code,
    description,
    country_id
)
VALUES (
           4,
           'Paris',
           2100000,
           '75000',
           'Capital of France',
           3
       );

INSERT INTO cities (
    id,
    name,
    population,
    zip_code,
    description,
    country_id
)
VALUES (
           5,
           'Luxembourg City',
           250000,
           '05463',
           'Capital of Luxembourg',
           4
       );

INSERT INTO cities (
    id,
    name,
    population,
    zip_code,
    description,
    country_id
)
VALUES (
           6,
           'Amsterdam',
           3600000,
           '10915',
           'Capital of Netherlands',
           5
       );
