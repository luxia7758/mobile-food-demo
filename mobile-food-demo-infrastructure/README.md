# mobile-food-demo-service


### startup

- Windows: java -jar  mobile-food-demo-service.jar
- Linux: nohup java mobile-food-demo-service.jar > mobile-food-demo-service/log/nohup.log &

## shutdown

 kill $(ps -ef|grep mobile-food-demo-service.jar|gawk '$0 !~/grep/ {print $2}' |tr -s '\n' ' ')
 
 

