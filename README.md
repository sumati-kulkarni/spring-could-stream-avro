# spring-could-stream-avro

1. Run SQL file in Oracle SQL (https://github.com/sumati-kulkarni/spring-could-stream-avro/blob/main/sql/sql_data.sql)
   -> creates 2 tables EMPLOYEE and DEPARTMENT with data
3. Run JDBC Source connector (https://github.com/sumati-kulkarni/spring-could-stream-avro/blob/main/connectors/EmpDeptSourceConnectorAvro.json)
   -> creates 2 topics avro_EMPLOYEE and avro_DEPARTMENT
5. Run Spring boot project to execute KTable-KTable join (https://github.com/sumati-kulkarni/spring-could-stream-avro/tree/main/emp-enrichment-avro)
