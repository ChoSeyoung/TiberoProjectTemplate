## Documentation

Tibero DataBase 사용을 위한 Spring Boot Template Repository 입니다. (v 2.4.3)
본 Repository는 다음과 같은 의존성 패키지를 포함합니다.

* Spring-boot-starter-web
* spring-boot-starter-tomcat
* spring-boot-starter-test
* lombok
* tibero-jdbc-14
* jasypt 1.17
* bcprov 1.46

## PS
추가로 JEUS에서 운용하기 위해서는 추가 작업을 해주어야 합니다.
Jenkins를 이용하는 경우에는 Github webhook을 이용하여 Jenkins 빌드를 통해 받은 war 파일을 Jeus Webadmin에서 Application 등록 후 Container에서 기동하면 됩니다.
Jenkins를 이용하지 않는 경우에는 Gradle build를 통하여 war파일 생성 후 Jeus Webadmin에서 Application 등록 후 Container에서 기동하면 됩니다.
