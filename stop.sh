CurPID=$(<"tweedly.pid")
kill $CurPID && sleep 3 && rm tweedly.pid;
