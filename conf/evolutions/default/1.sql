# Tweet schema

# --- !Ups

CREATE SEQUENCE tweet_id_seq;
CREATE TABLE tweets (
    id integer NOT NULL DEFAULT nextval('tweet_id_seq'),
    message varchar(4096),
    added TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    user_id integer NOT NULL,
    order_id integer NOT NULL DEFAULT 0,
    tweeted boolean NOT NULL DEFAULT FALSE,
    PRIMARY KEY (id)
);
CREATE INDEX uid_index ON tweets (user_id);
CREATE INDEX order_index ON tweets (order_id);

# --- !Downs

DROP TABLE tweets;
DROP SEQUENCE tweet_id_seq;