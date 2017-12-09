#!/bin/bash -eu
destdir=/usr/share/jenkins/ref/plugins.txt
if [ ! -z "$PLUGINS" ]
then 
    echo "$PLUGINS" > "$destdir"
fi