 #!/bin/bash
echo  "active users are $(users)">>log.txt
for user in $(users)
do 
echo $(hostname -I)>>log.txt
done
