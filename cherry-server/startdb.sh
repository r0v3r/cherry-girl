#!/usr/bin/env bash
mkdir -p data/db
mkdir -p data/log
mongod --dbpath data/db  --logpath data/log/$(date -d "today" +"%Y%m%d").log --fork&