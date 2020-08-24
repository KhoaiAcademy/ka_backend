-- HugSql definitions

-- :name register-new-user
-- :doc register new user using the provided password and username, verified-status default is false
insert into users (username, password, verified)
values (:username, :password, false)
