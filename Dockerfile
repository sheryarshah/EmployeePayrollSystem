FROM maven:3.8.3-openjdk-17

COPY . /usr/src/gatech/EmployeePayrollSystem
WORKDIR /usr/src/gatech/EmployeePayrollSystem
RUN mvn -DskipTests clean package

CMD mvn spring-boot:run