#!/bin/bash
set -e

DOWNLOAD_LINK="https://nuviun.com.br/VialerPJSIP.framework.zip"

cd ios && curl -L $DOWNLOAD_LINK -o dependencies.zip && unzip dependencies.zip && rm dependencies.zip
