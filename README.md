# junior-test
Postman collection
postman folder in root project directory
Run
mvn clean install
java -jar target/dropwizard-one-to-many-poc-1.0.jar server configuration.yml
Queries
Index :
curl -X GET http://localhost:8080/index | json_pp

Find All:
curl -X GET http://localhost:8080/jedi | json_pp


Used :
https://www.baeldung.com/spring-boot-h2-database
https://www.baeldung.com/mapstruct
https://www.baeldung.com/java-mapstruct-mapping-collections
https://stackoverflow.com/questions/47676369/mapstruct-and-lombok-not-working-together
https://stackoverflow.com/questions/70483299/hibernate-disable-alter-table-to-add-foreign-key-and-disable-alter-table-to-add?noredirect=1&lq=1
https://stackoverflow.com/questions/221379/hibernate-hbm2ddl-auto-update-in-production

https://java-online.ru/hibernate-entities.xhtml
https://function-x.ru/sql_subqueries.html


Окай, потрібно зробити сервер на наступних технологіях: Java 8, Spring Boot, Spring Data, Apache Maven.
БД in-memory, скажімо H2. В базі даних зв'язок один до багатьох між User та Article.
User має такі поля: id, name, age. Article має такі поля: id, text, color (enum).
На старті аплікації в БД повинно добавлятися 5-10 випадкових Users з Articles.
Потрібно зробити наступний АРІ:
1/ Дістати всіх Users, в яких age більше за якесь значення
Ok.
2/ Дістати всіх Users з Articles, в яких color якесь певне значення з enum-а

3/ Дістати унікальні name з Users, в яких більше ніж 3 Articles
Ok.
4/ Зберегти User
Ok.
5/ Зберегти Article
Ok.
6/ Також потрібно зробити наступний тип security: JWT-based
To run a job with Spring's JWT-based capabilities that allow you to test applications,
documentation used:  https://jwt.io/introduction

7/ Також потрібно написати 1-2 JUnit тести на будь який з цих методів АРІ (на контролери, на сервіси,
на ДАО-рівень). Тести повинні бути (!) якісні
To run a job with Spring's Test capabilities that allow you to test applications, documentation
used: https://docs.spring.io/spring-framework/docs/current/reference/html/testing.html


Залити цей код на GitHub і написати README як проект запускати
Створити колекцію в Postman або написати запити за допомогою curl тулзи, щоб можна було легко потестувати
(залити це в README або будь яким іншим відомим способом)

Якісь приклади можна переглянути скажімо в нас аккаунті компанії
Tech1: https://github.com/tech1-io/tech1-temple-java +
https://github.com/tech1-io/tech1-skeletons.
Якщо буде тобі щось корисне не поскупись на зірочку 🙂

SELECT * FROM USERS
WHERE ID IN (SELECT
user_id FROM article WHERE color='ORANGE')


SELECT users.id, users.name, users.age, article.color, article.text
FROM users INNER JOIN article
ON users.ID = article.user_id
where article.color = 'GREEN'


SELECT users.id, users.name, users.age, article.color, article.text
FROM users LEFT OUTER JOIN article
ON users.ID = article.user_id

SELECT users.id, users.name, users.age, article.color, article.text
FROM users INNER JOIN article
ON users.ID = article.user_id
ORDER BY users.id

select user_id, count(*) as kk
from article
group by  user_id
having count(*) > 3


select *
from users
where
id in  (select user_id
from article
group by  user_id
having count(*) > 3)

To run a job with Spring's Test capabilities that allow you to test applications,
documentation used:
https://docs.spring.io/spring-framework/docs/current/reference/html/testing.html