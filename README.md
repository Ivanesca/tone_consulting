## Тестовое задание на позицию Java-разработчик (Компания "T1 Консалтинг")
Приложение представляет является REST API с одним доступным endpoint-ом

- /api/v1/{line}/symbol-map

предоставляющим возможность получить словарь всех символов строки с соотвутсвующим количеством вхождений в исходную строку.

Для строки `"bbcccaaaa"` результатом будет список
```
[
  {
    "a": 4
  },
  {
    "c": 3
  },
  {
    "b": 2
  }
]
```
Длина исходной строки ограничена длиной URL и равна приблизительно 6000 символов.
Для запуска приложения необходимо собрать приложение в jar файл после чего вызвать docker compose файл следующими командами (из корня проекта):
```shell
./gradlew build 
sudo docker compose up -d
```
После чего будет доступен swagger-ui по слудующему URL
```
http://localhost:8008/swagger-ui.html
```

Для обращение к endpoint-у использовать URL
```
http://localhost:8008/api/v1/<строка для обработки>/symbol-map
```
