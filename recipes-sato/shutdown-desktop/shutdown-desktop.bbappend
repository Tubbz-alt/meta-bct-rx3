FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# Layer priority will force do_patch() to pick up file from this layer
SRC_URI_append_bct-rx3 = " file://shutdown.desktop"

