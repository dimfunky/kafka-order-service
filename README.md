# Kafka Order Service

## Общая информация

Набор микросервисов для обработки заказов пользователей, взаимодействующих через брокер сообщений Kafka.
Микросервисы поднимаются в Docker-контейнерах с помощью bash-скрипта, использующего docker-compose файлы.


## Содержание

- [Модули](#Модули)
- [Установка](#Установка)
- [Конфигурация](#Конфигурация)

## Модули

- `configuration/kafka-config` - модуль конфигураций Kafka
- `order-api` - API для управления заказами


## Установка

- Клонировать репозиторий
- В корневой директории проекта запустить 'mvn clean package'.
- В папке `script` запустить bash-скрипт `star-kafka-services.sh`



## Конфигурация
Kafka имеет UI, по умолчанию доступный на `localhost:8082`.
Чтобы UI увидел сервер Kafka, после запуска контейнеров в необходимо зайти на UI и добавить кластер Kafka:
- Указать произвольный Cluster name
- Bootstrap Servers: `kafka:9092`
- Metrics: 
  - metrics type: `JMX`
  - port: `9997`

Адрес сервера Kafka находится в переменной окружения `KAFKA_BOOTSTRAP_SERVERS` в
`configuration/kafka-config/src/main/resources/application-kafka.yml`. 
Если планируется использовать свой сервер Kafka, необходимо передать адрес сервера 
в переменную и убрать разворачивание Kafka из скрипта `star-kafka-services.sh`.
