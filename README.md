# microservices_1

Spring boot 2
-------------

<build>
    ...
    <plugins>
        ...
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        <configuration>
            <classifier>exec</classifier>
            </configuration>
        </plugin>
    </plugins>
</build>

Spring boot 1.5
---------------

<plugin>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-maven-plugin</artifactId>
    <executions>
        <execution>
            <goals>
                <goal>repackage</goal>
            </goals>
            <configuration>
                <classifier>exec</classifier>
            </configuration>
        </execution>
    </executions>
</plugin>
