#!/bin/bash

echo -e "====== Script to Say Hello! ====="
read -p "Give your name: " user
echo ""
if [ "$user" = "" ]; then 
	echo "Please, put a name" 
else 
	echo "Hi $user , have a nice day!"
fi
echo ""
#echo -e "Output: echo $?"
