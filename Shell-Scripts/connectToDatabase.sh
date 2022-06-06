#!/bin/bash 

#create a shell script that automatically connects to the database. 

containerName=$1; 
dBUser=$2; 

containers=$(docker ps | grep $1 | wc -l);

#check to see is containers equal zero.
#TODO cheek to see how many containers there are. 

if [ $containers -eq 0 ]; then
 	printf "Starting " 

docker start "$containerName";

fi

# check to see is string is empty

if [ -z $containerName ] || [ -z $dBUser ]; then
echo "Invalid response. Expected usage: $0 [container_name] [database_user]"
exit 1; 
fi


#docker exec -it $containerName "/bin/bash"; 
docker exec -it $containerName psql '-U' $gBUser
#docker exec -it $containerName $gBUser 



