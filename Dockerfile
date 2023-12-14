# compose-simple.yml
FROM nginx:latest

COPY content /usr/share/nginx/html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
# RUN ["apt-get", "update"]
# RUN ["apt-get", "install", "-y", "vim"]
