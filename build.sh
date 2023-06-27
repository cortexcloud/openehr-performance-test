mvn clean install
mvn -B package -DskipITs
docker build -t cortexcr.azurecr.io/ehrbase/performance-test:latest .