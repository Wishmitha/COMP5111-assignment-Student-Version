RANDOOP_JAR="lib/randoop-all-4.2.5.jar"
ROOT_DIR=$PWD
TARGET=$ROOT_DIR"/target/classes"

for i in 0 1 2 3 4
do
  java -ea -classpath ${RANDOOP_JAR}:${TARGET}/ \
     randoop.main.Main gentests \
     --testclass=comp5111.assignment.cut.ToolBox \
     --randomseed=$i \
     --time-limit=60 \
     --junit-package-name=comp5111.assignment.cut \
     --junit-output-dir=${ROOT_DIR}/src/test/randoop$i
done
