#!/usr/bin/sh
#|------------------------------------------------------------------|
#| ADC Testchip UART transmission back end                          |
#|------------------------------------------------------------------|
#| Version P1A, Deyan Levski, deyan.levski@eng.ox.ac.uk, 12.09.2016 |
#|------------------------------------------------------------------|
#|
#

ttyPort="ttyACM0"
silenceTime="0.0100"

word=$1
rate=$2
device=$3

stty -F $device speed $rate cs8 -echo  ## Set port settings

#firstletter=${word:4:4}

start_char=`echo $word | cut -c1-2`
byte_1=`echo $word | cut -c3-4`
byte_2=`echo $word | cut -c5-6`
byte_3=`echo $word | cut -c7-8`
byte_4=`echo $word | cut -c9-10`
byte_5=`echo $word | cut -c11-12`
byte_6=`echo $word | cut -c13-14`
byte_7=`echo $word | cut -c15-16`
byte_8=`echo $word | cut -c17-18`
byte_9=`echo $word | cut -c19-20`
byte_10=`echo $word | cut -c21-22`
byte_11=`echo $word | cut -c23-24`
byte_12=`echo $word | cut -c25-26`
byte_13=`echo $word | cut -c27-28`
byte_14=`echo $word | cut -c29-30`
byte_15=`echo $word | cut -c31-32`
byte_16=`echo $word | cut -c33-34`
byte_17=`echo $word | cut -c35-36`


echo "Sending byte stream:" $start_char '+' $byte_1 '+' $byte_2 '+' $byte_3 '+' $byte_4 '+' $byte_5 '+' $byte_6 '+' $byte_7 '+' $byte_8 '+' $byte_9 '+' $byte_10 '+' $byte_11 '+' $byte_12 '+' $byte_13 '+' $byte_14 '+' $byte_15 '+' $byte_16 '+' $byte_17

echo -en "\x$start_char" > $device
sleep $silenceTime
echo -en "\x$byte_1" > $device
sleep $silenceTime
echo -en "\x$byte_2" > $device
sleep $silenceTime
echo -en "\x$byte_3" > $device
sleep $silenceTime
echo -en "\x$byte_4" > $device
sleep $silenceTime
echo -en "\x$byte_5" > $device
sleep $silenceTime
echo -en "\x$byte_6" > $device
sleep $silenceTime
echo -en "\x$byte_7" > $device
sleep $silenceTime
echo -en "\x$byte_8" > $device
sleep $silenceTime
echo -en "\x$byte_9" > $device
sleep $silenceTime
echo -en "\x$byte_10" > $device
sleep $silenceTime
echo -en "\x$byte_11" > $device
sleep $silenceTime
echo -en "\x$byte_12" > $device
sleep $silenceTime
echo -en "\x$byte_13" > $device
sleep $silenceTime
echo -en "\x$byte_14" > $device
sleep $silenceTime
echo -en "\x$byte_15" > $device
sleep $silenceTime
echo -en "\x$byte_16" > $device
sleep $silenceTime
echo -en "\x$byte_17" > $device
sleep $silenceTime
