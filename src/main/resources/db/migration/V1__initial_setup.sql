DROP TABLE IF EXISTS "quarkus"."properties" CASCADE;
CREATE TABLE "quarkus"."properties"
(
    id                  varchar(40) NOT NULL,
    value               varchar(1024),
    CONSTRAINT properties_id_pkey PRIMARY KEY (id)
) WITH (oids = false);

INSERT INTO quarkus.properties(id, value) VALUES ('key.test.01', 'The value for: key.test.01');
INSERT INTO quarkus.properties(id, value) VALUES ('key.test.02', 'The value for: key.test.02');
INSERT INTO quarkus.properties(id, value) VALUES ('key.test.03', 'The value for: key.test.03');
INSERT INTO quarkus.properties(id, value) VALUES ('key.test.04', 'The value for: key.test.04');
INSERT INTO quarkus.properties(id, value) VALUES ('key.test.05', 'The value for: key.test.05');

