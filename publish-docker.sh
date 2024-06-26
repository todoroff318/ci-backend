version="1.0.0-SNAPSHOT"

echo "Publishing v$version"

echo "Removing old dist"
rm -rf ./dist

echo "Building"
npm run build

echo "Removing old images"
docker image remove -f todoroff318/test:test


echo "Building new images"
docker build -t todoroff318/test:test


echo "Publish to Dockerhub"
docker push todoroff318/test:test


echo "Publishing v$version completed!"
