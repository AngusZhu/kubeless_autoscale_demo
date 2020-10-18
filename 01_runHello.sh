kubeless function deploy hello --runtime python2.7 --from-file hello.py --handler hello.hello --cpu 200m --memory 100M && kubeless function ls && kubectl get pods
