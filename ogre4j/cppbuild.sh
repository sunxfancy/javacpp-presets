#!/bin/bash
# This file is meant to be included by the parent cppbuild.sh script
if [[ -z "$PLATFORM" ]]; then
    pushd ..
    bash cppbuild.sh "$@" ogre
    popd
    exit
fi

case $PLATFORM in
    linux-x86)
        export CC="clang -m32"
        export CXX="clang++ -m32"
        ;;
    linux-x86_64)
        export CC="clang -m64"
        export CXX="clang++ -m64"
        ;;
#    linux-armhf)
#        export CC_FLAGS="clang -target arm -march=armv7 -mfloat-abi=hard"
#        export CXX_FLAGS="-target arm -march=armv7 -mfloat-abi=hard"
#        ;;
    macosx-*)
        ;;
    *)
        echo "Error: Platform \"$PLATFORM\" is not supported"
        return 0
        ;;
esac

ln -s ../OGRE-2.1.0 ./$PLATFORM

cd ..
