#!/bin/bash
echo "Enter file  that you would  like to make exceuteable"
read file
if [ -f  "$file" ]
then 
mv $file $file.sh
sudo chmod +x $file.sh
echo "Filename has been updated"
else 
echo "File does not exist"
fi
