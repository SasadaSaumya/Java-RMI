# Java RMI Example 🔗

This project demonstrates how to implement and use **Java RMI (Remote Method Invocation)** in a distributed Java application. It includes both **RMI Server** and **RMI Client** components with two services: `StudentService` and `MessageService`.


## 🧠 What is RMI?

RMI allows an object running in one Java Virtual Machine (JVM) to invoke methods on an object in another JVM — enabling simple distributed computing using Java.


## 📁 Project Structure

```
Java-RMI/
│
├── RMIServer/ # Java RMI Server Project
│   └── services/
│       ├── MessageImpl.java
│       └── StudentImpl.java
│       └── RMIServer.java
│
├── RMIClient/ # Java RMI Client Project
│   └── RMIClient.java
│
├── common/ # Shared Interfaces & Models
│   ├── Message.java
│   ├── Student.java
│   └── StudentService.java
```


## 🚀 How to Run

### ✅ Prerequisites

- Java 11 or above
- GlassFish Server (tested with GlassFish 5.x)
- NetBeans or IntelliJ IDEA
- RMI Registry port: `6666`


### 🖥️ Step 1: Start GlassFish Server

Make sure GlassFish is running. You can start it via:

```bash
asadmin start-domain
```


### 📡 Step 2: Start the RMI Server

Navigate to `RMIServer` and run `RMIServer.java`:

```bash
java lk.mydomain.rmi.RMIServer
```

This will:

- Start an RMI registry on port 6666
- Bind two services: `student_service` and `message_service`

You should see:

```
RMI Server started...
```


### 👨‍💻 Step 3: Run the RMI Client

Navigate to `RMIClient` and run `RMIClient.java`. It demonstrates three methods of accessing RMI services:

- Using `LocateRegistry`
- Using `Naming.lookup()`
- Using `InitialContext` (JNDI - recommended)


## 📦 Services Overview

### 🧾 StudentService

```java
List<Student> getStudents();
```
Returns a list of student objects (id, name, address, contact).


### 💬 MessageService

```java
String hello(String name);
```
Returns a welcome message.


## 🔍 Sample Output

```
registry service: student_service
registry service: message_service
1 John Doe California 123456789
2 Jane Smith New York 987654321
Hello, Sasanda!
```


## 📚 Blog Post

Want a full breakdown? Read my Medium blog here:

👉 [Medium Blog Link](https://sasandasaumya.medium.com/java-rmi-a-simple-guide-with-practical-example-377ea221fb5b)


## 🧾 License

This project is open-source and available under the MIT License.


## 👨‍💻 Author

Sasanda Saumya  
📫 sasandasaumya.dev


## 🔗 GitHub Repo

📁 [https://github.com/SasadaSaumya/Java-RMI](https://github.com/SasadaSaumya/Java-RMI)
