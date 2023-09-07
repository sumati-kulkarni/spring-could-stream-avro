# spring-could-stream-avro

1. Run SQL file in Oracle SQL -> creates 2 tables EMPLOYEE and DEPARTMENT with data
2. Run JDBC Source connector -> creates 2 topics avro_EMPLOYEE and avro_DEPARTMENT
3. Run Spring boot project to execute KTable-KTable join
