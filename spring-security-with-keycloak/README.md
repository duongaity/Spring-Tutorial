
Login

curl --location 'http://localhost:9090/realms/asm/protocol/openid-connect/token' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--data-urlencode 'grant_type=password' \
--data-urlencode 'username=guest' \
--data-urlencode 'password=123456' \
--data-urlencode 'client_id=asm'

