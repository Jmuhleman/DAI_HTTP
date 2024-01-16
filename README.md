# DAI_HTTP


pour la scalability ajouter deploy:
				replicas: x
x = nombre d'instances

et modifier dynamiquement avec la commande suivante: docker-compose up --scale api/site-a=n -d
n = nombre d'instance à scaler
