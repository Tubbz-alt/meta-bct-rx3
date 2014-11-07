FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# Layer priority will force do_patch() to pick up file from this layer
SRC_URI_append_bct-re3 = " file://shutdown.desktop"
SRC_URI_append_bct-rm3 = " file://shutdown.desktop"

