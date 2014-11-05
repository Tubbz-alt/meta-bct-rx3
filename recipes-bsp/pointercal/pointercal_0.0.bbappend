FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

# Layer priority will force do_patch() to pick up pointercal from this layer
SRC_URI_append_bct-rx3 = " file://pointercal"


