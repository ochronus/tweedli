# SocialUser schema

# --- !Ups

CREATE TABLE social_users (
    id integer NOT NULL,
    added TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    first_name varchar(4096) DEFAULT '',
    last_name varchar(4096) DEFAULT '',
    full_name varchar(4096) DEFAULT '',
    email varchar(4096) DEFAULT '',
    avatar_url varchar(4096) DEFAULT '',
    oauth_id integer NOT NULL,
    PRIMARY KEY (id)
);

# --- !Downs

DROP TABLE social_users;
