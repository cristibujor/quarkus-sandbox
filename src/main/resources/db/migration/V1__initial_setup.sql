DROP TABLE IF EXISTS "quarkus"."properties" CASCADE;
CREATE TABLE "quarkus"."properties"
(
    id                  varchar(40) NOT NULL,
    value               varchar(1024),
    CONSTRAINT properties_id_pkey PRIMARY KEY (id)
) WITH (oids = false);
