
#!/bin/bash
 
REMOTE=csaba@base.mostof.it
REMOTE_APP=/var/www/play_projects/tweed.li
 
sbt stage || exit 1;
cp *.sh target/
ssh $REMOTE "cd $REMOTE_APP; ./stop.sh";
rsync --delete -va target/ $REMOTE:$REMOTE_APP/
ssh -n -f $REMOTE "cd $REMOTE_APP; nohup ./start.sh > /dev/null 2>&1 &";
