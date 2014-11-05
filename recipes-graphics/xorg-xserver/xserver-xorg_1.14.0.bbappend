FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

#Replace evdev touchscreen handler with tslib handler
SRC_URI_append_bct-rx3 = "file://0001-Use-tslib-touchscreen-handler.patch"



