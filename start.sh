nohup ./start -Dhttp.port=9090 1>wrapper.log 2>wrapper.log &
echo $! > tweedly.pid