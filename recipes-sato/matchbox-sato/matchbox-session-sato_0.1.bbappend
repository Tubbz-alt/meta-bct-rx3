FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI += "file://0001-Remove-battery-icon-from-header-bar.patch \
            file://0002-Start-matchbox-keyboard-daemon.patch"
