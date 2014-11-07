FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

# Layer priority will force do_patch() to pick up pointercal from this layer
SRC_URI_append_bct-re3 = " file://pointercal"
SRC_URI_append_bct-rm3 = " file://pointercal"


