[참고 사이트 https://blog.voidmainvoid.net](https://blog.voidmainvoid.net/category/%EB%B9%85%EB%8D%B0%EC%9D%B4%ED%84%B0/Kafka)  

**Mac OS 기준**  
```shell
# Kafka 설치 (homebrew)
brew install kafka

# Kafka 실행
brew services start kafka

# Kafka 설치 폴더 이동
cd /usr/local/opt/kafka/bin

# Kafka Topic 생성
./kafka-topics --create --bootstrap-server localhost:9092 --replication-factor 1 -partitions 1 --topic kafkatest

# Kafka Consumer Console 실행 
./kafka-console-consumer --bootstrap-server localhost:9092 --topic kafkatest --from-beginning
```