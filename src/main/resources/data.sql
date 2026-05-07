INSERT INTO countries (name) VALUES ('Lithuania');
INSERT INTO countries (name) VALUES ('Germany');
INSERT INTO countries (name) VALUES ('France');
INSERT INTO countries (name) VALUES ('Luxumbourg');
INSERT INTO countries (name) VALUES ('Netherlands');

INSERT INTO cities (
    name,
    population,
    zip_code,
    description,
    country_id
)
VALUES (
           'Vilnius',
           580000,
           'LT-01100',
           'Capital of Lithuania',
           1
       );

INSERT INTO cities (
    name,
    population,
    zip_code,
    description,
    country_id
)
VALUES (
           'Kaunas',
           300000,
           'LT-44000',
           'Second largest city in Lithuania',
           1
       );

INSERT INTO cities (
    name,
    population,
    zip_code,
    description,
    country_id
)
VALUES (
           'Berlin',
           3600000,
           '10115',
           'Capital of Germany',
           2
       );

INSERT INTO cities (
    name,
    population,
    zip_code,
    description,
    country_id
)
VALUES (
           'Paris',
           2100000,
           '75000',
           'Capital of France',
           3
       );

INSERT INTO cities (
    name,
    population,
    zip_code,
    description,
    country_id
)
VALUES (
           'Luxembourg City',
           250000,
           '05463',
           'Capital of Luxembourg',
           4
       );

INSERT INTO cities (
    name,
    population,
    zip_code,
    description,
    country_id
)
VALUES (
           'Amsterdam',
           3600000,
           '10915',
           'Capital of Netherlands',
           5
       );