# OAuth schema

# --- !Ups

CREATE SEQUENCE oauth_id_seq;
CREATE TABLE oauth (
    id integer NOT NULL DEFAULT nextval('oauth_id_seq'),
    oauth_version integer NOT NULL,
    token varchar(4096) NOT NULL,
    secret varchar(4096) DEFAULT '',
    token_type varchar(4096) DEFAULT '',
    expires_in integer DEFAULT 0,
    refresh_token varchar(4096) DEFAULT '',
    added TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
);

# --- !Downs

DROP TABLE oauth;
DROP SEQUENCE oauth_id_seq;
