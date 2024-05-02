FROM amazoncorretto:18

COPY build/libs/*.jar app.jar
COPY deploy/opentelemetry-javaagent.jar agent.jar

ENTRYPOINT [ \
  "java", \
  "-javaagent:agent.jar", \
  "-jar", \
  "app.jar" \
]