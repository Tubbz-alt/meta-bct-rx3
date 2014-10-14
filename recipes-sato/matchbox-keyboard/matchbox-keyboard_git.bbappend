FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://0001-Remove-desktop-shortcut-for-matchbox-keyboard.patch"

#Use later version of matchbox-keyboard that allows font size changes
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c \
                    file://src/matchbox-keyboard.h;endline=20;md5=d32122b95e8dbc6153cc73eba3702513 \
                    file://applet/applet.c;endline=20;md5=3a35fa28962df27b8b5626f4a9b2b244"

SRCREV = "cddcb0ec68fa643e092b0007a7bee5c31b4cb315"

