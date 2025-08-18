# Written by HAV0X_ on 8/18/2025
number=0
peak=0
steps=0

echo "Input a positive number to run the collatz conjecture on: "
read number

echo "Starting number: $number"

start=$(date +%s%N)
while [ $number -gt 1 ];
do
    if [ $(($number % 2)) == 0 ]; then
        number=$((number / 2))
    else
        number=$((number * 3 + 1))
    fi

if [ $number -gt $peak ]; then
    peak=$number
fi

((steps++))

done
end=$(date +%s%N)

echo "Peak number: $peak Steps: $steps Calculation time: $(($end-$start)) ns"
