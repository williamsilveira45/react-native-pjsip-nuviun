#!/bin/bash
set -e

DOWNLOAD_LINK="https://drive.google.com/file/d/1vmipYdd1pAQdVhfHel_93FpT1U6_sxZO/view?usp=sharing"

cd ios && curl -L $DOWNLOAD_LINK -o dependencies.zip && unzip dependencies.zip && rm dependencies.zip
