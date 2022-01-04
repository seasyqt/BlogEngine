CREATE TABLE captcha_codes
(
    id          bigserial primary key not null,
    time        timestamp             not null,
    code        varchar(255)          not null,
    secret_code varchar(255)          not null
);

CREATE TABLE global_settings
(
    id    bigserial primary key not null,
    code  varchar(255)          not null,
    name  varchar(255)          not null,
    value varchar(255)          not null
);

CREATE TABLE tags
(
    id   bigserial primary key not null,
    name varchar(255)          not null
);

CREATE TYPE moderation_status as ENUM ('NEW', 'ACCEPTED', 'DECLINED');

CREATE TABLE posts
(
    id                bigserial primary key not null,
    is_active         smallint              not null,
    moderation_status moderation_status     not null,
    moderator_id      bigint                not null,
    user_id           bigint                not null,
    time              timestamp             not null,
    title             varchar(255)          not null,
    text              varchar(255)          not null,
    view_count        varchar(255)          not null
);

CREATE TABLE users
(
    id           bigserial primary key   not null,
    is_moderator smallint                not null,
    reg_time     timestamp default now() not null,
    name         varchar(255)            not null,
    email        varchar(255)            not null,
    password     varchar(255)            not null,
    code         varchar(255),
    photo        varchar(255)
);

CREATE TABLE post_comments
(
    id        bigserial primary key   not null,
    parent_id bigint,
    post_id   bigint                  not null,
    user_id   bigint                  not null,
    time      timestamp default now() not null,
    text      varchar(255)            not null
);

CREATE TABLE post_votes
(
    id      bigserial primary key   not null,
    user_id bigint                  not null,
    post_id bigint                  not null,
    time    timestamp default now() not null,
    value   smallint                not null
);

CREATE TABLE tag2post
(
    post_id bigint not null,
    tag_id  bigint not null
);
