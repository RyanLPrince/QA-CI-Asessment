#!/bin/bash
echo "input your number"
read num
count=2
while [ $count -lt $num ]
do 
	if [ $((num%count)) -eq 0 ]
	then 
		echo is not prime
		exit
	else	
		((++count))
		
	fi
done
echo is prime
