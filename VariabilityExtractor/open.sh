#!/bin/sh

while read line
do
    name=$line
    echo "Opening - $name"
	gedit "input/configs/${name}.config"
	google-chrome "output/html/${name}.html"
done < "input/test_set.txt"
