#!/usr/bin/env bash
mkdir -p data/db
mkdir -p data/log
rm -f data/log/*
mongod --dbpath data/db  --logpath data/log/mongo.log --fork&